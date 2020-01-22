package br.com.victoramaral.atmconsultoria.ui.sobre;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import br.com.victoramaral.atmconsultoria.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "A ATM Consultoria tem como missão apoiar organizações que desejam" +
                " alcançar o sucesso através da excelência em gestão e da busca pela qualidade.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0.0");

        return new AboutPage( getActivity() )
                .setImage( R.drawable.logo )
                .setDescription( descricao )

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-Mail")
                .addWebsite("google.com", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("GoogleBrasil", "Facebook")
                .addInstagram("Google", "Instagram")
                .addTwitter("Google", "Twitter")
                .addYoutube("Google", "Youtube")
                .addGitHub("Google", "GitHub")

                .addItem(versao)

                .create();

    }

}
