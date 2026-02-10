@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", unique = true)
    private Client client;

    private LocalDate createdAt;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;
}
