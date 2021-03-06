package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class CategoriaPresupuestalDA  extends AbstractDA<CategoriaPresupuestal> implements Serializable{

    @Override
    public long registrar(CategoriaPresupuestal bean) {
        return save(bean);
    }

    @Override
    public long actualizar(CategoriaPresupuestal bean) {
        return update(bean);
    }

    @Override
    public long eliminar(CategoriaPresupuestal bean) {
        return delete(bean);
    }

    @Override
    public List<CategoriaPresupuestal> listar() {
        return list(CategoriaPresupuestal.class);
    }

    @Override
    public List<CategoriaPresupuestal> listar(String ref) {
        return list("FROM CategoriaPresupuestal cp"
                + " WHERE CONCAT(cp.denominacion,cp.tipoCategoria,cp.numeracion) LIKE '%"+ref+"%'");
    }

    @Override
    public List<CategoriaPresupuestal> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaPresupuestal buscar(long id) {
        return search("FROM CategoriaPresupuestal cp"
                + " WHERE cp.idcategoriaPresupuestal= "+id);
    }

    @Override
    public CategoriaPresupuestal buscar(String ref) {
        return search("FROM CategoriaPresupuestal cp"
                + " WHERE CONCAT(cp.denominacion,cp.tipoCategoria,cp.numeracion)= "+ref);
    }

    @Override
    public long id() {
        return maxId(CategoriaPresupuestal.class);
    }
    
}

