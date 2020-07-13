
package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author TARCISIO
 */
@Entity
@SequenceGenerator(name="FAB_SEC", sequenceName = "GEN_ID_FAB", initialValue = 0, allocationSize = 1)
public class Fabricante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAB_SEC")
    private Long idFab;
    @Column(nullable = false)
    private String nomeFab;
    @Column(nullable = false)
    private String endereco;

    public Long getIdFab() {
        return idFab;
    }

    public void setIdFab(Long idFab) {
        this.idFab = idFab;
    }

    public String getNomeFab() {
        return nomeFab;
    }

    public void setNomeFab(String nomeFab) {
        this.nomeFab = nomeFab;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
