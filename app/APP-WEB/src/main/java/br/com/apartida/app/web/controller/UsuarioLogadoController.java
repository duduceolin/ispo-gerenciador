///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.apartida.app.web.controller;
//
//import br.com.isoccer.servicos.usuarioservice.UsuarioDTO;
//import br.com.apartida.app.web.util.SessionContext;
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//
///**
// *
// * @author dudu
// */
//@SessionScoped
//@ManagedBean(name = "usuarioLogadoController")
//public class UsuarioLogadoController extends BaseController {
//
//    private UsuarioDTO usuarioLogado;
//
//    @PostConstruct
//    @Override
//    public void postConstruct() {
//        usuarioLogado = SessionContext.getInstance().getUsuarioLogado();
//    }
//
//    public UsuarioDTO getUsuarioLogado() {
//        return usuarioLogado;
//    }
//
//    public void setUsuarioLogado(UsuarioDTO usuarioLogado) {
//        this.usuarioLogado = usuarioLogado;
//    }
//
//}
