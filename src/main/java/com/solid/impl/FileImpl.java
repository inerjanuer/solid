package com.solid.impl;

import com.solid.interfaces.FileOperation;

public class FileImpl implements FileOperation {

  @Override
  public void saveToFile(String name) {
    System.out.println("Se guarda el nombre: "+name+ " en archivo nombres");
  }


}
