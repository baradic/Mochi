/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radic.Mochi.pomocno;

import java.util.List;

/**
 *
 * @author baradic
 */
public interface ObradaSucelje<T> {
    
    public List<T> getLista();
    public void kontrola(T t) throws MochiException;
    public T spremi(T t) throws MochiException;
    public void obrisi(T t) throws MochiException;
    
}
