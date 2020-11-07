package financeiro;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class WelcomeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String mensagem =  "Olá";
	

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
