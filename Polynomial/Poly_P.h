/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   Poly_P.h
 * Author: DELL
 *
 * Created on January 11, 2022, 7:55 PM
 */

#ifndef POLY_P_H
#define POLY_P_H

class Poly_P {
public:
    Poly_P(int);
    Poly_P(const Poly_P& orig);
    
    void display();
    void create();
    virtual ~Poly_P();
private:
    int degree;
    int x;
};

#endif /* POLY_P_H */

