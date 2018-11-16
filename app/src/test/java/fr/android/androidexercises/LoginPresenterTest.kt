package fr.android.androidexercises

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verifyAll
import org.junit.Before
import org.junit.Test

class LoginPresenterTest {

    @RelaxedMockK
    private lateinit var activity: LoginActivity
    private lateinit var presenter: LoginPresenter

    @Before
    fun setup(){
        MockKAnnotations.init(this)
        presenter = LoginPresenter(activity)
    }
    @Test
    fun testCheckCreditentialsCorrect(){
        presenter.checkCredentials("my pass")
        verifyAll {
            activity.logged()
            activity.message(R.string.text_logged)
        }
    }

    @Test
    fun testCheckCreditentialsIncorrect(){
        presenter.checkCredentials("my")
        verifyAll {
            activity.notLogged()
            activity.message(R.string.notLogged)
        }
    }
}