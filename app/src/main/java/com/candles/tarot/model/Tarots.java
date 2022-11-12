package com.candles.tarot.model;

import java.io.Serializable;

public class Tarots implements Serializable {
    private String _soTarot;
    private int _LinkAnh;

    public Tarots(){

    }

    public Tarots(String _soTarot, int _LinkAnh) {
        this._soTarot = _soTarot;
        this._LinkAnh = _LinkAnh;
    }

    public String get_soTarot() {
        return _soTarot;
    }

    public void set_soTarot(String _soTarot) {
        this._soTarot = _soTarot;
    }

    public int get_LinkAnh() {
        return _LinkAnh;
    }

    public void set_LinkAnh(int _LinkAnh) {
        this._LinkAnh = _LinkAnh;
    }
}
