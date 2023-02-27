
package com.ITicket.ITicket.controller;


import com.ITicket.ITicket.entity.Evento;
import com.ITicket.ITicket.entity.Precio;
import com.ITicket.ITicket.service.IEvento;
import com.ITicket.ITicket.service.IPrecio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class EventoController {
     @Autowired
    private IEvento eventoservice;
    
    @Autowired
    private IPrecio precioservice;
    
   
    @GetMapping("/Concierto")
    public String motrarEventos (Model model){
      List<Evento> listaEvento =  eventoservice.getAllEvento();
      model.addAttribute("titulo", "ConciertosDisponibles");
      model.addAttribute("evento", listaEvento);     
        return "Eventos";
    }
    
   @GetMapping("/Nuevo") 
   public String crearEventos(Model model){
       List<Precio> listaPrecio =  precioservice.listCountry();
      model.addAttribute("evento", new Evento());
      model.addAttribute("precio", listaPrecio);     
        return "Nuevo";  
   }
  
  
}
