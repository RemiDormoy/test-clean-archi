package com.example.myapplication

import com.example.myapplication.blue.BirthdateDataSource
import com.example.myapplication.domain.BirthdateInteractor
import com.example.myapplication.green.BirthdateRepository
import com.example.myapplication.green.MainController
import com.example.myapplication.green.MainPresenter

class MainModule(private val mainView: MainView) {

    fun createController(interactor: BirthdateInteractor) : MainController {
        return MainController(interactor)
    }

    fun createInteractor(
        presenter: MainPresenter,
        repository: BirthdateRepository
    ) : BirthdateInteractor {
        return BirthdateInteractor(repository, presenter)
    }

    fun createPresenter() : MainPresenter {
        return MainPresenter(mainView)
    }

    fun createRepository(dataSource: BirthdateDataSource): BirthdateRepository {
        return BirthdateRepository(dataSource)
    }

    fun createDataSource(): BirthdateDataSource {
        return BirthdateDataSource()
    }

    fun inject() : MainController {
        return createController(
            createInteractor(
                createPresenter(),
                createRepository(
                    createDataSource()
                )
            )
        )
    }
}