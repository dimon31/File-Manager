package orm.model;

import jakarta.persistence.*;

import java.io.Serializable;

//import javax.persistence.Basic;
//import javax.persistence.Column;

@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "ZSEQ_USER_ID", allocationSize = 1, initialValue = 10)
    @GeneratedValue(generator =  "userSeq")

    @Column(name = "ID")
    private Long userid;

    @Basic(optional = false)
    @Column(name = "NAME", length=64, unique = true)
    private String username;

    @Basic(optional = true)
    @Column(name = "PASSWORD", length=64)
    private String password;

    @Basic(optional = true)
    @Column(name = "ADMIN", length=64)
    private Boolean admin;

    public User() {}
    public User(String name) { this.username = name; }

    public Long getId() { return this.userid; }

    public void setId(Long id) { this.userid = id; }


    public String getUsername() { return this.username; }

    public void setUsername(String name) { this.username = name; }


    public Long getUserid() { return this.userid; }

    public void setUserid(Long id) { this.userid = id; }


    public Boolean getAdmin() { return this.admin; }

    public void setAdmin(Boolean admin) { this.admin = admin; }

}