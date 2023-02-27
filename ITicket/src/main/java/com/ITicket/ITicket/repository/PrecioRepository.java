
package com.ITicket.ITicket.repository;

import com.ITicket.ITicket.entity.Precio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecioRepository extends CrudRepository<Precio,Long> {
    
}
