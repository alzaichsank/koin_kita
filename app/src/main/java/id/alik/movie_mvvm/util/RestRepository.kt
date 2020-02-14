package id.alik.movie_mvvm.util

import id.alik.movie_mvvm.data.server.ApiService
import id.alik.movie_mvvm.data.server.ApiServiceManager

object RepositoryFactory {

    fun createApiRepository(): ApiServiceManager {
        val repoApi = RestUtil.instance.retrofit.create(ApiService::class.java)
        return ApiServiceManager(repoApi)
    }
}

