package pe.chala.gatito.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import pe.chala.gatito.models.entities.Cliente;
import pe.chala.gatito.services.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	
	
	@GetMapping("/registrar-cliente")
	public String registrarCliente(Model model)
	{
		Cliente cliente= new Cliente();
		try {
			model.addAttribute("cliente", cliente);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "/clientes/registrar-cliente";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("cliente") Cliente cliente, SessionStatus status)
	{ 
		try {
			
			clienteService.save(cliente);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/clientes/registrar-cliente";
	}
}
