package br.com.websige.controller.basico;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.websige.filter.basico.FilialFilter;
import br.com.websige.model.basico.Filial;
import br.com.websige.pattern.CadastroBean;
import br.com.websige.pattern.GenericRepository;
import br.com.websige.pattern.GenericService;

@Named
@javax.faces.view.ViewScoped
public class FilialBean extends CadastroBean<Filial, FilialFilter> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	public FilialBean(GenericRepository<Filial> repository, GenericService<Filial> service) {
		super(repository, service);
		setDirectory("/Restrict/Basico/Cadastro/Filial/");
	}
	
	public Filial getFilial() {
		return (Filial)getEntity();
	}
	public void setFilial(Filial filial) {
		setEntity(filial);
	}
	public List<Filial> getFiliais() {
		return getListEntity();
	}
	public void setFiliais(List<Filial> filiais) {
		setListEntity(filiais);
	}
	
	public FilialFilter getFilialFilter() {
		return getFilter();
	}

	public void setFilialFilter(FilialFilter filter) {
		setFilter(filter);
	}
	
	@Override
	public Filial createEntity(){
		return new Filial();
	}
	
	@Override
	public FilialFilter createFilter(){
		return new FilialFilter();
	}
	
	@Override
	protected String getParameterURL(Filial entityConsulted) {
		return "filial=" + entityConsulted.getId();
	};
}
