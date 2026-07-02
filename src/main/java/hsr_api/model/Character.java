package hsr_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    private String id;

    @Column(nullable = false)
    private String nombre;

    private int rareza;
    private String via;

    @Column(name = "elemento")
    private String elemento;

    @Column(name = "hp_base")
    private int hpBase;

    @Column(name = "atk_base")
    private int atkBase;

    @Column(name = "def_base")
    private int defBase;

    @Column(name = "spd_base")
    private int spdBase;

    public Character() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getRareza() { return rareza; }
    public void setRareza(int rareza) { this.rareza = rareza; }

    public String getVia() { return via; }
    public void setVia(String via) { this.via = via; }

    public String getElemento() { return elemento; }
    public void setElemento(String elemento) { this.elemento = elemento; }

    public int getHpBase() { return hpBase; }
    public void setHpBase(int hpBase) { this.hpBase = hpBase; }

    public int getAtkBase() { return atkBase; }
    public void setAtkBase(int atkBase) { this.atkBase = atkBase; }

    public int getDefBase() { return defBase; }
    public void setDefBase(int defBase) { this.defBase = defBase; }

    public int getSpdBase() { return spdBase; }
    public void setSpdBase(int spdBase) { this.spdBase = spdBase; }
}