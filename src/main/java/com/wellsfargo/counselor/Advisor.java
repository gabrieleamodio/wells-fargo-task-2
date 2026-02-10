@Entity
public class Advisor {

    @Id
    @GeneratedValue
    private Long advisorId;

    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;
}
