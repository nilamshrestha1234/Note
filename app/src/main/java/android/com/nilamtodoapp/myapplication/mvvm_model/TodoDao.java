package android.com.nilamtodoapp.myapplication.mvvm_model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface TodoDao {

    @Insert
    void insert(Todo note);

    @Update
    void update(Todo note);

    @Delete
    void delete(Todo note);

    @Query("DELETE FROM Todo")
    void deleteAllNote();

    @Query("SELECT * FROM Todo")
    LiveData<List<Todo>> getAllNotes();
}
































