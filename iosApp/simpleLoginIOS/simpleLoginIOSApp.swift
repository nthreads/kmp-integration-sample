//
//  simpleLoginIOSApp.swift
//  simpleLoginIOS
//
//  Created by Nauman Zubair on 22/01/2025.
//

import SwiftUI
import Shared

@main
struct SimpleLoginIOSApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView(viewModel: .init(loginRepository: LoginRepository(dataSource: LoginDataSource()), loginValidator: LoginDataValidator()))
        }
    }
}
