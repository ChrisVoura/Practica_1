
package com.ITicket.ITicket.repository;

import com.ITicket.ITicket.entity.Evento;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento,Long>{
    
}
