package com.jaimelxpez.data.di

import com.jaimelxpez.data.api.ShowApi
import com.jaimelxpez.data.repository.ShowRepositoryImpl
import com.jaimelxpez.domain.common.Constants.BASE_URL
import com.jaimelxpez.domain.repository.ShowRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideShowApi(): ShowApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ShowApi::class.java)
    }

    @Provides
    @Singleton
    fun provideShowRepository(api: ShowApi): ShowRepository{
        return ShowRepositoryImpl(api)
    }

}