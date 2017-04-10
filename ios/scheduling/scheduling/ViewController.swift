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

class ViewController: UIViewController {
    
    @IBOutlet var inputLogin: UITextField!
    @IBOutlet var inputSenha: UITextField!
    @IBOutlet var buttonSingIn: UIButton!
    
    let design = Design()
    
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
                                    let addAlerta = UIAlertController(title: "Login OK", message: "Login OK: \(user!.email)", preferredStyle: UIAlertControllerStyle.alert)
                                    addAlerta.addAction(UIAlertAction(title: "Cancelar", style: .cancel, handler: nil))
                                    self.present(addAlerta, animated: true, completion: nil)
                                    
                                    print("Login OK: \(user!.email)")
                                    
                                } else {
                                    let addAlerta = UIAlertController(title: "Login ERROR", message: "Login ERROR", preferredStyle: UIAlertControllerStyle.alert)
                                    addAlerta.addAction(UIAlertAction(title: "Cancelar", style: .cancel, handler: nil))
                                    self.present(addAlerta, animated: true, completion: nil)
                                    
                                }
        }
    }
    
    
    
}

