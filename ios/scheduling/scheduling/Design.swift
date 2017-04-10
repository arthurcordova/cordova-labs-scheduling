//
//  Design.swift
//  scheduling
//
//  Created by Arthur on 09/04/17.
//  Copyright © 2017 Cordova labs. All rights reserved.
//

import UIKit

class Design {
    
    func textField(textField: UITextField) {
        textField.borderStyle = .none
        textField.layer.backgroundColor = UIColor.white.cgColor
        textField.layer.masksToBounds = false
        textField.layer.shadowColor = UIColor.gray.cgColor
        textField.layer.shadowOffset = CGSize(width: 0.0, height: 1.0)
        textField.layer.shadowOpacity = 1.0
        textField.layer.shadowRadius = 0.0
    }
    
    func buttonFill (button: UIButton) {
        button.layer.cornerRadius = 8
    }
    
    func buttonStroke (button: UIButton) {
        button.layer.borderWidth = 1
        button.layer.borderColor = UIColor.lightGray.cgColor
        button.layer.cornerRadius = 8
    }

    
}
