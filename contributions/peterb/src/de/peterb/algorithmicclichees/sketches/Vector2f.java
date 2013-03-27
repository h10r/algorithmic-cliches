/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.peterb.algorithmicclichees.sketches;


import processing.core.PApplet;


public class Vector2f extends PApplet {

    float x;

    float y;

    public Vector2f(float x_, float y_) {
        x = x_;
        y = y_;
    }

    public void set(Vector2f v) {
        x = v.x;
        y = v.y;

    }

    /* magnitude(länge) rausfinden*/
    public float mag() {
        return (float) Math.sqrt(x * x + y * y);
    }

//addieren
    public void add(Vector2f v) {
        x = v.x;
        y = v.y;
    }

    public void add(float x_, float y_) {
        x = x_;
        y = y_;
    }

    //subtrahieren
    public void sub(Vector2f v) {
        x -= v.x;
        y -= v.y;
    }

    public void sub(float x_, float y_) {
        x -= x_;
        y -= y_;
    }

    //multiplizieren mit einem skalar
    public void mult(float s_) {
        x *= s_;
        y *= s_;
    }

    //dividieren
    public void div(float d_) {
        x /= d_;
        y /= d_;
    }
}