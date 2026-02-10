package com.wellsfargo.counselor;

import jakarta.persistence;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Advisor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long advisorId;

  private String firstName;
  private String lastName;
  private String email;

  @OneToMany(mappedBy = "advisor")
  private List<Client> clients;

  // JPA requires a no-arg constructor
  public Advisor() {}

  // Optional convenience constructor
  public Advisor(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public Long getAdvisorId() {
    return advisorId;
  }

  public void setAdvisorId(Long advisorId) {
    this.advisorId = advisorId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Client> getClients() {
    return clients;
  }

  public void setClients(List<Client> clients) {
    this.clients = clients;
  }
}
