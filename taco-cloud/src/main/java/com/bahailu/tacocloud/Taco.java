package com.bahailu.tacocloud;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
  String designName;
  List<Ingredient> ingredients;
}
