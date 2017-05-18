package bj.insult.insult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bj.insult.AppComponent
import bj.insult.R
import bj.insult.common.BaseController
import com.hanks.htextview.typer.TyperTextView
import kotlinx.android.synthetic.main.controller_fuck_generator.view.*
import javax.inject.Inject

/**
 * Created by Josh Laird on 18/05/2017.
 */
class InsultController(args: Bundle) : BaseController(), InsultContract.View {
    val targetName = args.getString("targetName")!!
    val yourName = args.getString("yourName")!!

    @Inject
    lateinit var presenter: InsultPresenter
    lateinit var tvInsult: TyperTextView

    override fun setupComponent(appComponent: AppComponent) {
        appComponent
                .insultComponentBuilder()
                .buildInsultModule(InsultModule(this))
                .build()
                .inject(this)
    }

    override fun displayInsult(insult: String) {
        tvInsult.text = ""
        tvInsult.animateText(insult)
    }

    override fun onAttach(view: View) {
        super.onAttach(view)
        presenter.fetchInsult(targetName, yourName)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_fuck_generator, container, false)
        tvInsult = view.tvInsult
        view.btnNewInsult.setOnClickListener { _ -> presenter.fetchInsult(targetName, yourName) }
        return view
    }
}