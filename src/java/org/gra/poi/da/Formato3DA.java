package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato3DA  extends AbstractDA<Formato3> implements Serializable{

    @Override
    public long registrar(Formato3 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato3 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato3 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato3> listar() {
        return list(Formato3.class);
    }

    @Override
    public List<Formato3> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formato3> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato3 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato3 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

