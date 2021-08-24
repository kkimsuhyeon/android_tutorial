package com.example.part2_chapter4

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.part2_chapter4.dao.HistoryDao
import com.example.part2_chapter4.model.History

@Database(entities = [History::class], version = 1) // 데이터베이스라는것을 알려주기 위한 어노테이션
// 버전에 따라서 차이가 있기때문에 명시가 필요함
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}