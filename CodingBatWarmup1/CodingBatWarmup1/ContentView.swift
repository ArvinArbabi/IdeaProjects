import SwiftUI

func sleepIn(weekday: Bool, vacation: Bool) -> Bool {
    !weekday || vacation
}

struct ContentView: View {
    var body: some View {
        Text("SleepIn demo")
            .onAppear {
                print(sleepIn(weekday: false, vacation: false)) // true
                print(sleepIn(weekday: true,  vacation: false)) // false
                print(sleepIn(weekday: false, vacation: true))  // true
            }
    }
}
