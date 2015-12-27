package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class SubgrupoDA  extends AbstractDA<Subgrupo> implements Serializable{

    @Override
    public long registrar(Subgrupo bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Subgrupo bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Subgrupo bean) {
        return delete(bean);
    }

    @Override
    public List<Subgrupo> listar() {
        return list(Subgrupo.class);
    }

    @Override
    public List<Subgrupo> listar(String ref) {
        return list("FROM Subgrupo sg"
                + " WHERE CONCAT(sg.denominacion,sg.numeracion) LIKE '%"+ref+"%'");
    }

    @Override
    public List<Subgrupo> listar(long id) {
        return list("FROM Subgrupo sg"
                +" INNER JOIN FETCH sg.categoriaPresupuestal cp"
                +" WHERE cp.idcategoriaPresupuestal="+id);
    }

    @Override
    public Subgrupo buscar(long id) {
        return search("FROM Subgrupo sg"
                + " WHERE sg.idsubgrupo= "+id);
    }

    @Override
    public Subgrupo buscar(String ref) {
        return search("FROM Subgrupo sg"
                + " WHERE CONCAT(sg.denominacion,sg.numeracion)= "+ref);
    }

    @Override
    public long id() {
        return maxId(Subgrupo.class);
    }  
}

