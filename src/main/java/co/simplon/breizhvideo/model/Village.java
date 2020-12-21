package co.simplon.breizhvideo.model;

import javax.persistence.*;

// mapp à la base de donnée
@Entity
@Table(name = "film")
public class Village {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "postCode")
    private String postCode;

    //Default constructor
    public Village(){

    }
    // Constructor
    public Village(String name, String postCode) {
        super();
        this.name = name;
        this.postCode = postCode;
    }
// Getter et setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
