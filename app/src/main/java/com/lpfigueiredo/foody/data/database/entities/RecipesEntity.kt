package com.lpfigueiredo.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lpfigueiredo.foody.models.FoodRecipe
import com.lpfigueiredo.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0;
}