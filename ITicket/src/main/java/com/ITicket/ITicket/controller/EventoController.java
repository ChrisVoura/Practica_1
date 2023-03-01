
package com.ITicket.ITicket.controller;


import com.ITicket.ITicket.entity.Evento;
import com.ITicket.ITicket.service.IEvento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class EventoController {
     @Autowired
    private IEvento eventoservice;

    @GetMapping("/Concierto")
    public String motrarEventos (Model model){
      List<Evento> listaEvento =  eventoservice.getAllEvento();
      model.addAttribute("titulo", "ConciertosDisponibles");
      model.addAttribute("evento", listaEvento);     
        return "Eventos";
    }
    
   @GetMapping("/Nuevo") 
   public String crearEventos(Model model){
         model.addAttribute("evento", new Evento());  
        return "Nuevo";  
   }
   @PostMapping("/Guardar")
   public String guardarEvento(Evento evento){
       eventoservice.saveEvento(evento);
       return "redirect:/Concierto";
   }
   @GetMapping("/delete/{id}")
   public String eliminarEvento(@PathVariable Long id){
       eventoservice.delete(id);
       return "redirect:/Concierto";
   }
  
   
}
