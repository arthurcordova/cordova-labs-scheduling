//
//  ViewController.swift
//  scheduling
//
//  Created by Arthur on 05/04/17.
//  Copyright © 2017 Cordova labs. All rights reserved.
//

import UIKit
import Firebase
import FirebaseAuth

class LoginController: UIViewController {
    
    @IBOutlet var inputLogin: UITextField!
    @IBOutlet var inputSenha: UITextField!
    @IBOutlet var buttonSingIn: UIButton!
    
    let design = Design()
    var mainView : UIStoryboard!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        design.textField(textField: inputLogin)
        design.textField(textField: inputSenha)
        design.buttonFill(button: buttonSingIn)
        
        FIRAuth.auth()!.addStateDidChangeListener() { auth, user in
            if user != nil {
                print("Login OK 1")
            } else {
                print("Login ERROR")
            }
        }
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    @IBAction func SignIn(_ sender: UIButton) {
        FIRAuth.auth()!.signIn(withEmail: inputLogin.text!,
                               password: inputSenha.text!) { (user, error) in
                                
                                if user != nil {
                                    self.mainView = UIStoryboard(name: "Main", bundle: nil)
                                    let mainController : UITabBarController = self.mainView.instantiateInitialViewController() as! UITabBarController
                                    
                                    let appDelegate = UIApplication.shared.delegate! as! AppDelegate
                                    appDelegate.window!.rootViewController = mainController

                                    
                                    
                                    
                                } else {
                                    let addAlerta = UIAlertController(title: "Erro", message: "E-mail ou a senha informado inválido. Por favor tente novamente. ", preferredStyle: UIAlertControllerStyle.alert)
                                    addAlerta.addAction(UIAlertAction(title: "OK", style: .cancel, handler: nil))
                                    self.present(addAlerta, animated: true, completion: nil)
                                    
                                }
        }
    }
    
    
    
}

