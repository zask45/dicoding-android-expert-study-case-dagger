package com.dicoding.tourismapp.core.di

import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

    /* KENAPA MENGGUNAKAN @BINDS?
        Anotasi @Binds digunakan untuk bentuk non-concrete seperti abstract class dan interface.
        Bisa dilihat pada kasus ini fungsi provideRepository akan mereturn dalam bentuk interface -
        sehingga anotasi yang digunakan adalah @Binds bukan @Provides
    * */
}