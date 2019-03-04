package com.cn.behavior.visitor.example.computer;

import java.util.ArrayList;
import java.util.List;

public class Computer {

   private List<ComputerPart> computerParts=new ArrayList<ComputerPart>();


   public Computer(){
       computerParts.add(new CPU());
       computerParts.add(new HardDisk());
       computerParts.add(new VideoCard());
   }

    /**
     * 想装机，先得提供硬件接口才行
     * @param hardwareInterface
     */
    public void useComputer(HardwareInterface hardwareInterface){

        for(ComputerPart computerPart:computerParts){
            computerPart.link(hardwareInterface);
        }

    }

}
