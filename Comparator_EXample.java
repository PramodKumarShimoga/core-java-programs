package com.xworkz.collectionsapp.dec22;

import java.util.Comparator;

import com.xworkz.collectionsapp.SanitizerDTO;

class Comparator_EXample implements Comparator<SanitizerDTO>
{
    // Used for sorting in ascending order of
    // roll number
    public double compare(SanitizerDTO a, SanitizerDTO b)
    {
        return a.getPrice() - b.getPrice();
    }
}