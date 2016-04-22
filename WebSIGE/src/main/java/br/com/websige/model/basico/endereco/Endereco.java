package br.com.websige.model.basico.endereco;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.websige.pattern.interfaces.IBaseEntity;

@Entity
@Table(name = "ENDERECO_END")
public class Endereco implements IBaseEntity ,Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "END_ID")
	private Long id;
	
	@Column(name = "END_CDENDERECO", nullable = false, length = 3)
	private String codigo;
	
	@Column(name = "END_NRCEP", nullable = false, length = 9)
	private String cep;
	
	@Column(name = "END_DSLOGRADOURO", nullable = false, length = 40)
	private String logradouro;
	
	@Column(name = "END_NRNUMERO", nullable = false, length = 7)
	private String numero;
	
	@Column(name = "END_DSCOMPLEMENTO", nullable = false, length = 20)
	private String complemento;
	
	@Column(name = "END_NMBAIRRO" , nullable = false, length = 25)
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name = "END_IDCIDADE", nullable = false, foreignKey = @ForeignKey(name = "FK1_ENDERECO_END"))
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn(name = "END_CDESTADO", nullable = false, foreignKey = @ForeignKey(name = "FK3_ENDERECO_END"))
	private UF estado;
	
	@ManyToOne
	@JoinColumn(name = "END_IDPAIS", nullable = false, foreignKey = @ForeignKey(name = "FK2_ENDERECO_END"))
	private Pais pais;
	
	@Column(name="END_DSOBSERVACAO", nullable = true, length = 80)
	private String observacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public UF getEstado() {
		return estado;
	}

	public void setEstado(UF estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
