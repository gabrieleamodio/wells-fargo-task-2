@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;

    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;
}
