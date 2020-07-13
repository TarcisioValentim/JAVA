/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author CLIENTE
 */
@Entity
@SequenceGenerator(name = "VEIC_SEC", sequenceName = "GEN_ID_VEIC", initialValue = 0, allocationSize = 1)
public class Veiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VEIC_SEC")
    private Long idVeic;
    @Column(nullable = false)
    private String modelo;
    @Column
    private String cor;
    @Column(nullable = false)
    private Integer ano;
    @ManyToOne
    private Fabricante fabricante;
    
    public Long getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(Long idVeic) {
        this.idVeic = idVeic;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
}
