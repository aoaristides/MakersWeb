package br.com.stockcontrol.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.stockcontrol.model.Peca;
import br.com.stockcontrol.repository.Pecas;
import br.com.stockcontrol.repository.filter.PecaFilter;

@Named
@ViewScoped
public class GerarCodigoBarrasBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Peca peca;
	
	private List<Peca> pecas;
	
	@Inject
	private Pecas pecasRepository;
	
	@PostConstruct
	public void init() {
		this.pecas = pecasRepository.filtradas(new PecaFilter());
	}

	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	
	public List<Peca> getPecas() {
		return pecas;
	}

}
