package com.rus.chat.repositories.login.datasource

import com.rus.chat.entity.session.SessionQuery
import com.rus.chat.entity.session.Handle
import rx.Observable

/**
 * Created by RUS on 11.07.2016.
 */
interface SessionDataSource {

    @Handle(SessionQuery.Register::class)
    fun register(query: SessionQuery.Register): Observable<Unit>

    @Handle(SessionQuery.SignIn::class)
    fun signIn(query: SessionQuery.SignIn): Observable<Unit>

    @Handle(SessionQuery.SignOut::class)
    fun signOut(query: SessionQuery.SignOut): Observable<Unit>

}