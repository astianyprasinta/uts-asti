package id.astiany_18090059.catatanpenjualan.activity.login

import id.astiany_18090059.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}