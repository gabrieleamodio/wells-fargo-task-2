package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long portfolioId;

  @OneToOne
  @JoinColumn(name = "client_id", unique = true)
  private Client client;

  private LocalDate createdAt;

  @OneToMany(mappedBy = "portfolio")
  private List<Security> securities;

  public Portfolio() {}

  public Portfolio(Client client, LocalDate createdAt) {
    this.client = client;
    this.createdAt = createdAt;
  }

  public Long getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(Long portfolioId) {
    this.portfolioId = portfolioId;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public List<Security> getSecurities() {
    return securities;
  }

  public void setSecurities(List<Security> securities) {
    this.securities = securities;
  }
}
