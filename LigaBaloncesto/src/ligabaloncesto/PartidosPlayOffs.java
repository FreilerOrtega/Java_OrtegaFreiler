/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;

/**
 *
 * @author Usuario
 */

public class PartidosPlayOffs extends Partidos{
    
    private int jornada;
    private String tipoRonda;

    public PartidosPlayOffs(int jornada, String tipoRonda, String equipoLocal, String equipoVisitante, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.jornada = jornada;
        this.tipoRonda = tipoRonda;
    }

    @Override
    public String toString() {
        return "PartidosPlayOffs{" + "jornada=" + jornada + ", tipoRonda=" + tipoRonda + '}';
    }
}

