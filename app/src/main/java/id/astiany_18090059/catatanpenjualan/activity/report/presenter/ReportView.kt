package id.astiany_18090059.catatanpenjualan.activity.report.presenter

import id.astiany_18090059.catatanpenjualan.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}