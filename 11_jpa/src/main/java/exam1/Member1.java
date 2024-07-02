package exam1;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "JpaMember")
public class Member1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "uname")
    private String username;
    @Column(name = "create_date")
    private LocalDate createDate;

    protected Member1() {}

    public Member1( String username, LocalDate createDate) {

        this.username = username;
        this.createDate = createDate;
    }


}
