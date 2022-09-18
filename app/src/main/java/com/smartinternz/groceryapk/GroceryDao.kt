package com.smartinternz.groceryapk

import androidx.lifecycle.LiveData
import androidx.room.*
import com.smartinternz.groceryapk.GroceryItems

@Dao

interface GroceryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)
    @Delete
    suspend fun delete(item: GroceryItems)
    @Query("SELECT * FROM Grocery_items")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>


}

