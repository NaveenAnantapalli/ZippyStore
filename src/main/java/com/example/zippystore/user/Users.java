package com.example.zippystore.user;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "tblUser")
public class Users implements UserDetails {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_phone_number")
    private Long userPhoneNumber;

    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "user_dob")
    private LocalDate userDOB;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    private Boolean locked;

    private Boolean enabled;

    @Transient
    private Integer userAge;

    public Users(String userName, String email, Long userPhoneNumber, String userAddress, LocalDate userDOB) {
        this.userName = userName;
        this.email = email;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress = userAddress;
        this.userDOB = userDOB;
    }

    public Integer getUserAge() {
        return Period.between(this.userDOB, LocalDate.now()).getYears();
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
